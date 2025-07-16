const slider = document.getElementById('slider');
const prev = document.getElementById('prev');
const next = document.getElementById('next');

let currentIndex = 0;
const totalImages = slider.children.length;
let interval;

function showSlide(index) {
    if (index < 0) {
        currentIndex = totalImages - 1;
    } else if (index >= totalImages) {
        currentIndex = 0;
    } else {
        currentIndex = index;
    }
    slider.style.transform = `translateX(-${currentIndex * 600}px)`;
}

function nextSlide() {
    showSlide(currentIndex + 1);
}

function prevSlide() {
    showSlide(currentIndex - 1);
}

function startAutoPlay() {
    interval = setInterval(nextSlide, 3000);
}

function stopAutoPlay() {
    clearInterval(interval);
}

next.addEventListener('click', () => {
    nextSlide();
    stopAutoPlay();
    startAutoPlay();
});

prev.addEventListener('click', () => {
    prevSlide();
    stopAutoPlay();
    startAutoPlay();
});

slider.addEventListener('mouseenter', stopAutoPlay);
slider.addEventListener('mouseleave', startAutoPlay);

startAutoPlay();
