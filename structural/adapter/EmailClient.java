package structural.adapter;

class EmailClient {
    public void sendEmail(String emailAddress, String subject, String body) {
        System.out.println("Email yuborildi [" + emailAddress + "]: \n  Mavzu: " + subject
                + "\n  Matn: " + body);
    }
}
