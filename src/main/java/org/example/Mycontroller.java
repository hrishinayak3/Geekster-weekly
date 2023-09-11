package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

    @Autowired
    private Person person; // Spring autowires the Person bean

    @Autowired
    private Address address; // Spring autowires the Address bean

    @Autowired
    private Email email; // Inject the EmailService

    @GetMapping("/getMappings")
    public String getMappings() {
        String response = "Person: " + person.toString() + "\nAddress: " + address.toString();

        // Send the email here
        String emailSubject = "Object Data";
        String emailText = response;

        email.sendEmail("hrishinayak3@gmail.com", "Test","EMAIL SPAM" );

        return response;
    }
}
