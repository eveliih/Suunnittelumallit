package main;

class ComputerFacade {
    private CPU cpu_;
    private Memory memory_;
    private HardDrive hard_drive_;
    
    public ComputerFacade() {
        cpu_ = new CPU();
        memory_ = new Memory();
        hard_drive_ = new HardDrive();
    }
    
    public void Start() {
        cpu_.Freeze();
        memory_.Load(kBootAddress, hard_drive_.Read(kBootSector, kSectorSize));
        cpu_.Jump(kBootAddress);
        cpu_.Execute();
    }
    
    private static final long kBootAddress = 0;
    private static final long kBootSector = 0;
    private static final int kSectorSize = 4;
}
