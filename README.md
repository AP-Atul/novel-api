# novel-api
API/Scrapper for Light Novels

Scrapper for https://www.readlightnovel.org/

## Usage 
1. Download the jar file
```console
wget https://github.com/AP-Atul/novel-api/raw/main/jar/ln-v0.1.jar
```

2. Add to the project.

3. Declare class object of NClient
```java
class Sample implements NListener {
    NClient client = new NClient(this);
}
```

4. Call the required methods
```java
// genre and the page no
client.browse(null, 1);

// string query to search for
client.search(query);

// to retrieve all the details and the pages for the novel
client.novel(novel);

// to retrieve the content for the chapter
client.chapter(chapter);

// returns the Set for all the genres
client.genres();
```

5. Implement the listener methods
```java
@Override
public void searchResult(List<Novel> novels) {
   
}

@Override
public void pageResult(NovelChapter chapter) {

}

@Override
public void novelResult(Novel novel) {

}

@Override
public void browseResult(List<Novel> novels) {

}
```

## Using with Android
1. For use with Android, you can make use of ```BroadcastReceiver``` or ```LiveData```.
2. All variables are public for the model classes.

