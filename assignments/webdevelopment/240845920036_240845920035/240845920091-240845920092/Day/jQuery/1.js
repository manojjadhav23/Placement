$(document).ready(function() {
    $('h1').first().css("backgroundColor", "orange"); // First <h1> background to blue
    $('h1').css("color", "RED");
    $('h1:odd').css("color", "blue");
    $('h1:odd').css("backgroundColor", "white");
    $('h1').last().css("backgroundColor", "green")
    // $('h1').css("backgroundColor", "BLACK"); // All <h1> text color to red
});

// $('h1').first().css("backgroundColor", "Blue");
