package guru.springframework.test.ds;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class QADataSource implements FakeDataSource{
    @Override
    public String getConnecionInfo() {
        return "I'm the QA DataSource";
    }
}
