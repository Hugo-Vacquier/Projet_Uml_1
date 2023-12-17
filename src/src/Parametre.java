import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("c4144c38-4811-40cf-9927-612b74c30918")
public class Parametre {
    @objid("2a562885-256e-49d0-9530-a1e2d2acd49d")
    private int volume;

    @objid("c7408405-190d-44a9-a36a-0671a14ccecb")
    private int debitParole;

    @objid("b60af442-42d1-479a-b802-0ee9bdbddb11")
    public int getVolume() {
        return volume;
    }

    @objid("488bd3a1-7e7d-40a4-b6aa-ab8b45aa3bba")
    public int getDebitParole() {
        return debitParole;
    }

    @objid("b5caa241-1107-4a4c-a1ee-072408bb33e0")
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @objid("7eced229-72b4-4361-93fb-ab39b377d78a")
    public void setDebitParole(int debitParole) {
        this.debitParole = debitParole;
    }
}
