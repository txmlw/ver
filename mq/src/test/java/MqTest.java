import com.mrliang.mq.MqApplication;
import com.mrliang.mq.core.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liang wei
 * @description 用一句话描述下该文件的作用
 * @date 2017/8/3 14:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=MqApplication.class)
public class MqTest {
    @Autowired
    private Sender sender;
    @Test
    public void hello() throws Exception {
        sender.send();
    }
}
