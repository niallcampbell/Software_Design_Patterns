
/**
 * This is the adapter class and it implements the MediaPlayer interface. 
 * 
 * This adapter enables the AudioPlayer class (which implements the MediaPlayer interface) to play AdvancedMediaPlayer objects as well. 
 * 
 * It acts as a bridge between the MediaPlayer and AdvancedMediaPlayer interfaces. 
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public class MediaAdapter implements MediaPlayer
{
   AdvancedMediaPlayer advancedMusicPlayer;

   //Constructor
   public MediaAdapter(String audioType)
   {
      if(audioType.equalsIgnoreCase("vlc"))
      {
         advancedMusicPlayer = new VlcPlayer();			
      }
      else if(audioType.equalsIgnoreCase("mp4"))
      {
         advancedMusicPlayer = new Mp4Player();
      }	
   }

   /**
    * Prints/plays VLC or MP4 files. 
    */
   @Override
   public void play(String audioType, String fileName)
   {
      if(audioType.equalsIgnoreCase("vlc"))
      {
         advancedMusicPlayer.playVlc(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4"))
      {
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}
