document.getElementById('btnUpload').addEventListener(
    'click', function () {
        const imgElement = document.getElementById('imgInput')
        const file = imgElement.files[0]
        const reader = new FileReader()
        reader.addEventListener(
            'load',
            function () {
                console.log(reader.result)
            }
        )
        reader.readAsDataURL(file)
    })