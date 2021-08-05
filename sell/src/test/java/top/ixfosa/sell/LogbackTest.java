package top.ixfosa.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ixfosa on 2021/8/5 18:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogbackTest {
    @Test
    public void test1() {
        log.info("info...");
        log.error("error..");
    }
}
