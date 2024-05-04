function animateButtonClick() {
    var button = document.getElementById("myButton");
    // Add the animation class
    button.classList.add("button-click-animation");
  
    // Remove the animation class after the animation completes
    setTimeout(function() {
      button.classList.remove("button-click-animation");
    }, 300); // 300 milliseconds, same as the animation duration
  }
  