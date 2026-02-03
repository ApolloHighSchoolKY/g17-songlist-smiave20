public class MusicDownloads{
  private List<DownloadInfo> downloadList;

  public MusicDownloads()
  {   downloadList = new ArrayList<DownloadInfo>();   }

  public DownloadInfo getDownloadInfo(String title)
  {
    /* To be implemented in part (a) */
    //Revised Answer

    //This method is a DownloadInfo method. 
    //That means it must return a DownloadInfo object.
    //For each Loop is necessary to match this requirement
    
    for(DownloadInfo x: downloadList)

      //Go backwards then what you are thinking
      //If the paramater equals the DownloadInfo object's title, seen from the getTitle() method
      //Then return that object from the list.
      //If they do not match, return nothing (null)

      if(title.equals(x.getTile()))
          return x;
      else
          return null;
  }
/*
  No, still the half way. 
  Must Call Methods!!!
  int count = 0;

    for(int i = 0; i > downloadList.size()-1; i++)
      if(DownloadInfo.equals(title))
        count++;
      else
        return null;
    
    return count;

 */
  public void updateDownloadInfo(List<String> titles)
  {
    /* To be implemented in part (b) */
    
    //Void, no return line

    for(String x: titles)

      //If the object in the new ArrayList equals the same as in the original, downloadList
      if(x.getDownloadInfo().equals(titles))
        return x.incrementTimesDownloaded();
      else
        //If title is not found in downloadInfo, then add the new title to the end of the ArrayList,
        //With the title of the new song and how many times downloaded.
        //Will be at the end of the ArrayList because we used .add().
          x.add(titles.getTile().incrementTimesDownloaded());



  }
}
