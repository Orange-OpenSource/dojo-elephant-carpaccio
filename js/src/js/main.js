(function () {
    var button_calculate = document.getElementById('button_calculate');
    var a_form = document.getElementById('a_form');

    button_calculate.onclick = function () {
        var inputAge = a_form.querySelector('#age').value
        var output_age = a_form.querySelector('#output_age');
        output_age.innerHTML = inputAge;
    };
})();