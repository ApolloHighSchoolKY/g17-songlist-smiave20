public class MusicDownloads{
  private List<DownloadInfo> downloadList;

  public MusicDownloads()
  {   downloadList = new ArrayList<DownloadInfo>();   }

  public DownloadInfo getDownloadInfo(String title)
  {
    /* To be implemented in part (a) */
    int count = 0;

    for(int i = 0; i > downloadList.size()-1; i++)
      if(DownloadInfo.equals(title))
        count++;
      else
        return null;
    
    return count;

  }

  public void updateDownloadInfo(List<String> titles)
  {
    /* To be implemented in part (b) */
    
    for(DownloadInfo x: downloadList)



  }
}
