// 화면에 나타날 요소들을 모두 가져오기
const revealElements = document.querySelectorAll(".reveal");


// 요소가 화면에 들어왔는지 확인하는 기능
const revealObserver = new IntersectionObserver(
  (entries) => {

    entries.forEach((entry) => {

      if (entry.isIntersecting) {

        entry.target.classList.add("active");

        revealObserver.unobserve(entry.target);

      }

    });

  },
  {
    threshold: 0.15
  }
);


// 각 요소를 관찰
revealElements.forEach((element) => {

  revealObserver.observe(element);

});



// 페이지 맨 처음 HERO는 조금 더 빠르게 등장
window.addEventListener("load", () => {

  const heroContent = document.querySelector(".hero-content");

  if (heroContent) {

    setTimeout(() => {

      heroContent.classList.add("active");

    }, 200);

  }

});



// 헤더 메뉴를 누르면 부드럽게 이동
const menuLinks = document.querySelectorAll('a[href^="#"]');

menuLinks.forEach((link) => {

  link.addEventListener("click", (event) => {

    const targetId = link.getAttribute("href");

    if (targetId === "#") {
      return;
    }

    const targetSection = document.querySelector(targetId);

    if (targetSection) {

      event.preventDefault();

      targetSection.scrollIntoView({
        behavior: "smooth"
      });

    }

  });

});
