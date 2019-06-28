package springboot0703mail;

import org.apache.logging.log4j.message.SimpleMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ResourceUtils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.FileNotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot0703MailApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void testSimple() {
        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setFrom("1174762989@qq.com");
        mailMessage.setSubject("放假通知");
        mailMessage.setText("别想多了，小老弟");
        mailMessage.setTo("287341402@qq.com");//buhuizeng@foxmail.com
        mailSender.send(mailMessage);
    }
    @Test
    public void testMIME() throws MessagingException, FileNotFoundException {
        MimeMessage mailMessage= mailSender.createMimeMessage();
        //multipart=true别省略
        MimeMessageHelper helper=new MimeMessageHelper(mailMessage,true);
        helper.addAttachment("1.class", ResourceUtils.getFile("classpath:springboot0703mail/Springboot0703MailApplication.class"));
        helper.addAttachment("p1.png", new File("C:\\Users\\11747\\Pictures\\Camera Roll\\xilili.jpg"));
        helper.setFrom("1174762989@qq.com");
        helper.setSubject("放假通知");
        helper.setTo("287341402@qq.com");
        /*html=true*/
        helper.setText("<h3 style='color:green'>别想多了，小老弟</h3>",true);

        mailSender.send(mailMessage);
    }

}
