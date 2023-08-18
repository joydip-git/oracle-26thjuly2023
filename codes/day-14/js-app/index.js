//AJAX => asynchronous JavaScript and XML

//function to load data in SELECT element
function loadProductNamesInSelect(products) {
    const selectElement = document.getElementById('ddlProducts')
    products
        .forEach(
            (p) => {
                const option = document.createElement('option')
                option.text = p.productName
                option.value = p.productId
                selectElement.options.add(option)
            }
        )
}
//function to load data in form element
function displayData(productObject) {
    document.getElementById('spanProduct').innerText = productObject.productName;
    document.getElementById('txtName').value = productObject.productName;
    document.getElementById('txtPrice').value = productObject.price.toString();
    document.getElementById('txtDesc').value = productObject.description;
    document.getElementById('txtId').value = productObject.productId.toString();
    document.getElementById('txtCatId').value = productObject.categoryId.toString();
}
//function to get producy detail by a given id
function getProductDataById() {

    const selectObject = document.getElementById('ddlProducts')
    //'options' returns an array of all options present in the SELECT element
    const allOptions = selectObject.options
    //get the index of the selected option
    const index = selectObject.selectedIndex
    //now get the selected option object from the SELECT element
    const selectedOption = allOptions[index]
    sendAsyncRequest(
        'GET',
        `http://localhost:8080/PmsApp/rest/products/get/${selectedOption.value}`,
        function (resp) {
            displayData(resp.responseData)
        }
    )

    //const req = new XMLHttpRequest()
    //console.log("readystate value(initial): " + req.readyState)

    // req.onreadystatechange = () => {
    //     //console.log("readystate value: " + req.readyState)
    //     if (req.status === 200 && req.readyState === 4) {
    //         console.log(req.responseText)
    //         const serviceResponse = JSON.parse(req.responseText)
    //         console.log(serviceResponse)
    //         //displayData(serviceResponse.responseData)
    //         displayData(serviceResponse)
    //     }
    // }



    // console.log(selectedOption.text)
    // console.log(selectObject.value)

    //req.open('GET', 'http://localhost:8080/PmsApp/rest/products/get/' + selectedOption.value)
    //req.open('GET', 'http://localhost:8080/rest/products/get/' + selectedOption.value)
    //req.send()
}

//function to get all the products
function getProducts() {
    sendAsyncRequest(
        'GET',
        'http://localhost:8080/PmsApp/rest/products/sort/2',
        function (resp) {
            loadProductNamesInSelect(resp.responseData)
        }
    )
    //const req = new XMLHttpRequest()

    // req.onreadystatechange = () => {
    //     if (req.status === 200 && req.readyState === 4) {
    //         console.log(req.responseText)
    //         const serviceResponseObject = JSON.parse(req.responseText)
    //         console.log(serviceResponseObject)
    //         //loadProductNamesInSelect(serviceResponseObject.responseData)
    //         loadProductNamesInSelect(serviceResponseObject)
    //         //localStorage.setItem("token",serviceResponseObject)
    //     }
    // }

    //req.open('GET', 'http://localhost:8080/PmsApp/rest/products/sort/2')
    //req.open('GET', 'http://localhost:8080/rest/products/getall')
    //const bearerToken = "Bearer " + localStorage.getItem("token")
    //req.setRequestHeader("Authorization",bearerToken)
    //req.send(JSON.stringify({username:"sjhgjhs", password:"", }))
    //req.send()
}
/*
const btnObject = document.getElementById('btnLoad')
//if (btnObject !== undefined) {
if (btnObject) {
    btnObject.addEventListener('click', getProductsData)
}
*/

//code which will be executed immediately afetr DOM content creation is completed and the page is loaded in the browser
window
    .addEventListener(
        'DOMContentLoaded',
        function () {
            //part-1: link change event of the SELECT element with a function
            //this function will be called back when the change event of the SELECT element is fired by changing the selection from SELECT element
            document
                .getElementById('ddlProducts')
                .addEventListener('change', getProductDataById)

            //fetch all the products from RESTful API server and load the product names and ids in the SELECT element
            getProducts()
        }
    )
