package com.alik.springapp.lsn8;

//@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
//@Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id=1;
    }

//    @Override
//    public String toString() {
//        return "Computer id" + id + " " + musicPlayer.playMusic();
//    }
}
