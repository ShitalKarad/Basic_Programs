function student(){
    var name = $('#name').val();
    var fName = $('#fatherName').val();
    var mName = $('#motherName').val();
    var moNumber = $('#mobileNo').val();
    var gender = $('input[name="gender"]:checked').value;
    var gender = $('#gender').val();

    var date = $('#date').val();
    var marks = $('#marks').val();
   
    console.log(name)
    console.log(fName)
    console.log(mName)
    console.log(moNumber)
    console.log(gender)
    console.log(date)
    console.log(marks)

    let requestload = {
        "name": name,
        "fatherName":fName,
        "motherName":mName,
        "moNum":moNumber,
        "gender": gender,
        "date":date,
        "marks":marks
       
      }
      console.log(requestload);

      $.ajax({
        url: 'http://localhost:3000/students',
        type: 'POST',
        dataType: 'json',
        data: requestload,
        success: function (data) {
          console.log(data);
        },
        error: function () {
          console.log('Error in Operation');
        }
      })
    
}

