$(document).ready(function() {
    // Attach click event handler to each button
    $('button').click(function() {
        alert($(this).text() + ' clicked!'); // Show alert with button text
    });
});
