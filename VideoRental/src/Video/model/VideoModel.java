
package Video.model;

import entity.Guest;
import java.util.ArrayList;

public class VideoModel {
    
    private Guest guest;
    private ArrayList<Guest> vidborrowed;
    
    public VideoModel(){
        guest = new Guest();
        vidborrowed = new ArrayList<Guest>();   
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public ArrayList<Guest> getVidborrowed() {
        return vidborrowed;
    }

    public void setVidborrowed(ArrayList<Guest> vidborrowed) {
        this.vidborrowed = vidborrowed;
    }
    
    
    
}
