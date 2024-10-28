// JavaScript function to validate form
function validateForm() {
    // Fetch the form elements
    const studentName = document.getElementById("studentName").value;
    const department = document.getElementById("department").value;
    const year = document.getElementById("year").value;
    const startDate = new Date(document.getElementById("startDate").value);
    const endDate = new Date(document.getElementById("endDate").value);
    const reason = document.getElementById("reason").value;

    // Check if start date is not after end date
    if (startDate > endDate) {
        alert("Start date cannot be less than end date.");
        return false;
    }

    // Check if reason is at least 10 characters long
    if (reason.length < 10) {
        alert("Please provide a more detailed reason for leave.");
        return false;
    }

    // If all validations pass
    alert("Application submitted successfully!");
    return true;
}
