import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("d0732bcd-acc7-4a10-96e6-116b1420b9d5")
public class SystemeDeNavigation {
    @objid("4619dad9-6f23-4d36-b4ca-c5a7861f700a")
    private Instruction instruction;

    @objid("bd7fe234-a28e-471d-9b63-ad5f9eb83b98")
    private CommandeVocale commandeVocale;

    @objid("0dcbf3fb-4982-4f30-bc53-a9280b1e494b")
    private Urgence Urgence;

    @objid("ff4c8276-ece3-4a36-ae1e-ec3cfcd3ca40")
    private Parametre parametre;

    @objid("bcda49a7-dd75-4d9e-93c9-835be28fa9c2")
    private Localisation localisation;

    @objid("de391ab4-3eee-4ad0-8c6b-df626ce4474e")
    public void demarrerNavigation() {
        // Implémentation pour démarrer la navigation
    }

    @objid("8666e4c6-fc16-4a9b-969e-e9a0f5ad9973")
    public void arreterNavigation() {
        // Implémentation pour arrêter la navigation
    }

    @objid("8a73bef6-608c-4799-8d6b-8499d29e1a7a")
    public Localisation getLocalisation() {
        return localisation;
    }

    @objid("bac1aa6e-78b6-4c7e-8eda-7c97c25873ee")
    public void setDestination(final Localisation localisation) {
        this.localisation = localisation;
    }

    @objid("f7e285a9-d602-4fb0-b9b1-836b6a91f4ac")
    public void ajusterParametre(final Parametre parametre) {
        this.parametre = parametre;
    }

    @objid("new-uuid-here")
    public SystemeDeNavigation() {
        this.instruction = new Instruction();
        this.commandeVocale = new CommandeVocale();
        this.Urgence = new Urgence();
        this.parametre = new Parametre();
        this.localisation = new Localisation();
    }
}

