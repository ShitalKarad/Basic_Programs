$(function() {
    $.ajax({
        url: 'http://localhost:3000/students',
        type:'GET',
        dataType:'json',
        success: function (data) {
            console.log(data);
            var tableBody = $('#display');
            $.each(data, function ( index, students) {
                var row = $('<tr>');
                row.append($('<td>').text(students.name));
                row.append($('<td>').text(students.fatherName));
                row.append($('<td>').text(students.motherName));
                row.append($('<td>').text(students.moNum));
                row.append($('<td>').text(students.gender));
                row.append($('<td>').text(students.date));
                row.append($('<td>').text(students.marks));
                tableBody.append(row);
              });
        },
         error: function () {
        }

    });

})
function addSudent() {
    window.location.href='Templates\form.html';
}