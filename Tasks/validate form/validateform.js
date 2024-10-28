function validateForm() {
    // Clear previous errors
    document.getElementById("nameError").innerHTML = "";
    document.getElementById("qualificationError").innerHTML = "";
    document.getElementById("genderError").innerHTML = "";
    document.getElementById("positionError").innerHTML = "";
    document.getElementById("successMessage").innerHTML = "";
  
    // Get form values
    const name = document.getElementById("name").value.trim();
    const qualification = document.getElementById("qualification").value;
    const gender = document.querySelector('input[name="gender"]:checked');
    const position = document.getElementById("position").value;
    
    let isValid = true;
    
    // Name validation
    if (name === "") {
      document.getElementById("nameError").innerHTML = "Name is required";
      isValid = false;
    }
  
    // Qualification validation
    if (qualification === "") {
      document.getElementById("qualificationError").innerHTML = "Please select a qualification";
      isValid = false;
    }
  
    // Gender validation
    if (!gender) {
      document.getElementById("genderError").innerHTML = "Please select your gender";
      isValid = false;
    }
  
    // Position validation
    if (position === "") {
      document.getElementById("positionError").innerHTML = "Please select a position to apply for";
      isValid = false;
    }
  
    // Final check
    if (isValid) {
      document.getElementById("successMessage").innerHTML = "Application Submitted Successfully!";
    }
  }
  