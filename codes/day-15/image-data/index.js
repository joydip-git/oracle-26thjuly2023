document.getElementById('btnUpload').addEventListener(
    'click', function () {
        const imgElement = document.getElementById('imgInput')
        const file = imgElement.files[0]
        const reader = new FileReader()
        reader.addEventListener(
            'load',
            function () {
                console.log(reader.result)
                const data = {
                    productId: Number(document.getElementById('txtId').value),
                    productName: document.getElementById('txtName').value,
                    productImage: reader.result
                }
                const req = new XMLHttpRequest()
                req.onreadystatechange = function () {
                    if (req.status === 200 && req.readyState === 4) {
                        console.log(JSON.parse(req.responseText))
                    }
                }
                req.open('POST', 'http://localhost:8080/PmsApp/rest/products/upload', true)
                req.setRequestHeader("Content-Type", "application/json")
                req.send(JSON.stringify(data))
            }
        )
        reader.readAsDataURL(file)
    })

document.getElementById('btnLoad').addEventListener(
    'click',
    function () {
        const req = new XMLHttpRequest()
        req.onreadystatechange = function () {
            if (req.status === 200 && req.readyState === 4) {
                console.log(req.responseText)
                const jsData = JSON.parse(req.responseText)
                const tableBody = document.getElementById('tblBody')
                tableBody.innerHTML = ""

                for (const data of jsData.responseData) {

                    const tdId = document.createElement('td')
                    tdId.innerText = data.productId.toString()

                    const tdName = document.createElement('td')
                    tdName.innerText = data.productName.toString()

                    const imgEle = document.createElement('img')
                    imgEle.src = data.productImage
                    imgEle.alt = "NA"
                    imgEle.style.width = "200px";
                    imgEle.style.margin = "2px";

                    const tdImg = document.createElement('td')
                    tdImg.appendChild(imgEle)

                    const row = document.createElement('tr')
                    row.append(tdId, tdName, tdImg)

                    tableBody.append(row)
                }
            }
        }
        req.open('GET', 'http://localhost:8080/PmsApp/rest/products/uploadedfiles')
        req.send()
    }
)
