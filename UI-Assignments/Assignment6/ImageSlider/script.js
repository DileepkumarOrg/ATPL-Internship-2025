const slides = document.getElementById("slides");
const slideImages = slides.querySelectorAll("img");
const totalSlides = slideImages.length;

let index = 0;
let intervalId = null;

function showSlide(i) {
  // Ensure index stays within range
  index = (i + totalSlides) % totalSlides;
  slides.style.transform = `translateX(${-index * 600}px)`;
}

document.getElementById("prev").addEventListener("click", () => {
  showSlide(index - 1);
});

document.getElementById("next").addEventListener("click", () => {
  showSlide(index + 1);
});

function startAutoPlay() {
  intervalId = setInterval(() => {
    showSlide(index + 1);
  }, 3000);
}

function stopAutoPlay() {
  clearInterval(intervalId);
}

// Start auto-play
startAutoPlay();

// Pause on hover
const carousel = document.getElementById("carousel");
carousel.addEventListener("mouseenter", stopAutoPlay);
carousel.addEventListener("mouseleave", startAutoPlay);
