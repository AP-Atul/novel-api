package com.atul.novel;

import java.util.List;

import com.atul.model.*;

public interface NListener {
	void browseResult(List<Novel> novels);
	
	void novelResult(Novel novel);
	
	void searchResult(List<Novel> novels);
	
	void pageResult(NovelChapter chapter);
}
