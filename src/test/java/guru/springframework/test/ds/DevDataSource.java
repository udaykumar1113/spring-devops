package guru.springframework.test.ds;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"dev","default"})
public class DevDataSource implements FakeDataSource{
    @Override
    public String getConnecionInfo() {
        return "I'm the Development DataSource";
    }
}
