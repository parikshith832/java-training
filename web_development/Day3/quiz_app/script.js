let storedUser = "";
let storedPass = "";

// REGISTER
function register() {
  let u = regUser.value;
  let p = regPass.value;

  if (!u || !p) return alert("Fill all fields");

  storedUser = u;
  storedPass = p;

  alert("Registered!");
  switchPage("LoginPage");
}

// LOGIN
function login() {
  let u = loginUser.value;
  let p = loginPass.value;

  if (u === storedUser && p === storedPass) {
    switchPage("quizPage");
    startQuiz();
  } else {
    alert("Wrong credentials");
  }
}

// PAGE SWITCH
function switchPage(id) {
  document
    .querySelectorAll(".page")
    .forEach((p) => p.classList.remove("active"));
  document.getElementById(id).classList.add("active");
}

const questionBank = [
  {
    q: "HTML stands for?",
    options: ["Hyper Text Markup Language", "High Text", "None", "Tool"],
    answer: 0,
  },
  {
    q: "CSS used for?",
    options: ["Styling", "Structure", "DB", "Server"],
    answer: 0,
  },
  {
    q: "JS is?",
    options: ["Programming Language", "Styling", "DB", "None"],
    answer: 0,
  },
  {
    q: "Which tag is paragraph?",
    options: ["<p>", "<h1>", "<div>", "<span>"],
    answer: 0,
  },
  {
    q: "CSS property for color?",
    options: ["color", "bg", "font", "style"],
    answer: 0,
  },
  {
    q: "JS output method?",
    options: ["console.log()", "print()", "echo()", "write()"],
    answer: 0,
  },
  {
    q: "HTML tag for link?",
    options: ["<a>", "<link>", "<href>", "<url>"],
    answer: 0,
  },
  {
    q: "CSS layout system?",
    options: ["Flexbox", "Loop", "Function", "Class"],
    answer: 0,
  },
  {
    q: "JS variable keyword?",
    options: ["let", "int", "varible", "define"],
    answer: 0,
  },
  {
    q: "HTML heading?",
    options: ["<h1>", "<p>", "<div>", "<span>"],
    answer: 0,
  },
  { q: "CSS unit?", options: ["px", "kg", "sec", "m"], answer: 0 },
  { q: "JS array index starts?", options: ["0", "1", "-1", "2"], answer: 0 },
  {
    q: "Event click?",
    options: ["onclick", "onhover", "onrun", "onstart"],
    answer: 0,
  },
  {
    q: "HTML image tag?",
    options: ["<img>", "<image>", "<pic>", "<src>"],
    answer: 0,
  },
  {
    q: "CSS display flex?",
    options: ["flex", "block", "inline", "none"],
    answer: 0,
  },
  {
    q: "JS typeof?",
    options: ["typeOf", "typeof", "kindOf", "varType"],
    answer: 1,
  },
  { q: "HTML list?", options: ["<ul>", "<ol>", "Both", "None"], answer: 2 },
  {
    q: "CSS margin?",
    options: ["space outside", "inside", "border", "none"],
    answer: 0,
  },
  {
    q: "JS function keyword?",
    options: ["function", "fun", "define", "method"],
    answer: 0,
  },
  {
    q: "HTML form?",
    options: ["<form>", "<input>", "<button>", "<data>"],
    answer: 0,
  },
];

let questions, index, score, timer, time;

// START
function startQuiz() {
  questions = questionBank.sort(() => 0.5 - Math.random()).slice(0, 20);
  index = 0;
  score = 0;
  loadQuestion();
}

function loadQuestion() {
  clearInterval(timer);
  time = 15;
  timerEl.innerText = time;

  timer = setInterval(() => {
    time--;
    timerEl.innerText = time;
    if (time === 0) {
      clearInterval(timer);
      nextQuestion();
    }
  }, 1000);

  let q = questions[index];

  // 👇 QUESTION NUMBER
  document.getElementById("qNumber").innerText = `Question ${index + 1}/20`;

  question.innerText = q.q;

  options.innerHTML = "";

  q.options.forEach((opt, i) => {
    let div = document.createElement("div");
    div.className = "option";
    div.innerText = opt;

    div.onclick = () => checkAnswer(i, div);

    options.appendChild(div);
  });
}

function checkAnswer(ans, el) {
  let correct = questions[index].answer;
  document.querySelectorAll(".option").forEach((o) => (o.onclick = null));

  if (ans === correct) {
    el.classList.add("correct");
    score++;
  } else {
    el.classList.add("wrong");
  }

  clearInterval(timer);
}

// NEXT
function nextQuestion() {
  index++;
  if (index < questions.length) {
    loadQuestion();
  } else {
    switchPage("resultPage");
    scoreEl.innerText = `Score: ${score}/20`;
  }
}

// RESTART
function restart() {
  location.reload();
}

// DOM refs
const regUser = document.getElementById("regUser");
const regPass = document.getElementById("regPass");
const loginUser = document.getElementById("loginUser");
const loginPass = document.getElementById("loginPass");
const question = document.getElementById("question");
const options = document.getElementById("options");
const timerEl = document.getElementById("timer");
const scoreEl = document.getElementById("score");
