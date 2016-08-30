package com.career.mail;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.opensymphony.xwork2.ActionSupport;

public class Emailer extends ActionSupport {

    private static String upassword;
    private static String from = "trainees@sysbiz.net";
    private static String password = "STPL2012$$";
    private static String to;
    private static String subject;
    private static String body;
    static final Properties properties = new Properties();

    static {
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");
    }

    public static String getUpassword() {
        return upassword;
    }

    public static void setUpassword(String upassword) {
        Emailer.upassword = upassword;
    }

    public static String getBody() {
        return body;
    }

    public static void setBody(String body) {
        Emailer.body = body;
    }

    public static String getFrom() {
        return from;
    }

    public static void setFrom(String from) {
        Emailer.from = from;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Emailer.password = password;
    }

    public static String getSubject() {
        return subject;
    }

    public static void setSubject(String subject) {
        Emailer.subject = subject;
    }

    public static String getTo() {
        return to;
    }

    public static void setTo(String to) {
        Emailer.to = to;
    }

    public static Properties getProperties() {
        return properties;
    }

    public static String execute(String empid, String username, String upassword) {
        String ret = SUCCESS;
        try {
            to = username;
            subject = "Hi User";
            body = "You have registered successfully.\n your password is: ";
            System.out.println("Email class");
            System.out.println(upassword);
            body = body.concat(upassword);
            body = body.concat("\nPlease Click here to Confirm your activation \n");
            body = body.concat("http://localhost:8080/NewFinal/emailverify.jsp?empid=");
            body = body.concat(empid);
            body = body.concat("\n");
            sendmail(body);
            body = "";
            subject = "";
        } catch (Exception e) {
            System.out.println(e);
            ret = ERROR;
        }
        return ret;
    }

    public static void sendmail(String body) {
        try {
            Session session = Session.getDefaultInstance(properties,
                    new javax.mail.Authenticator() {

                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(from, password);
                        }
                    });

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(body);
            Transport.send(message);

        } catch (MessagingException ex) {
            Logger.getLogger(Emailer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void sendmailwhileapply(String mail, String jobrole) {
        subject = "Applied Succesfully";
        body = "You have applied for ";
        String body1 = " successfully. If you meet eligibility criteria, we will contact you soon.\n If any queries please contact at trainees@sysbiz.net \n Regards \n Avinash\n  HR Executive\n Contact: 8019866745";
        body = body.concat(jobrole);
        body = body.concat(body1);
        to = null;
        to = mail;
        sendmail(body);
    }
}