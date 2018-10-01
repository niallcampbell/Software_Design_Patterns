
/**
 * Concrete class that implements the MediaPlayer interface. 
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public class AudioPlayer implements MediaPlayer
{
   MediaAdapter mediaAdapter; //Creates an adapter object so that the audioplayer can play files associated with the AdvancedMediaPlayer interface. 
                                //i.e. gives the standard AudioPlayer objects access to the AdvancedMediaPlayer interface and its objects. 
   @Override
   public void play(String audioType, String fileName)
   {        
      //inbuilt support to play mp3 music files
      if(audioType.equalsIgnoreCase("mp3"))
      {
         System.out.println("Playing mp3 file. Name: " + fileName);         
      } 
      //mediaAdapter is providing support to play other file formats
      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4"))
      {
         mediaAdapter = new MediaAdapter(audioType); //creates a MediaAdapter object which can create AdvancedMediaPlayer files. 
         mediaAdapter.play(audioType, fileName); //plays these files for the standard AudioPlayer. 
      }
      else
      {
         System.out.println("Invalid media. " + audioType + " format not supported");
      }
   }   
}
