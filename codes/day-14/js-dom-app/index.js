function buttonClicked() {
    window.alert("hello everybody....")
}
function checkboxSelectionChanged() {
    window.alert("will remember you....")
}

function changeText() {
    //in JS code I am accessing browser DOM library API(getElementById) and object (document), to fetch the h2 element instance in the DOM
    var headerElement = document.getElementById('introHeader');
    headerElement.innerText = "Introduction to JavaScript";
}


// var btnObject = document.getElementById('btnChange')
// //btnObject = NULL
// btnObject.addEventListener('click', changeText)