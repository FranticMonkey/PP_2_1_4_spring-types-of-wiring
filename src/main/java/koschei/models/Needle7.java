package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {
    private Deth8 det;

    @Autowired
    public void setDeth (Deth8 det) {
        this.det = det;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :(";
    }
}
