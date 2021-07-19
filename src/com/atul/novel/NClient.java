package com.atul.novel;

import java.util.Set;

import com.atul.model.Novel;
import com.atul.model.NovelChapter;

public class NClient {
	private final NListener listener;
	
	public NClient(NListener listener) {
		this.listener = listener;
	}
	
	
    public void browse(String genre, int page) {
        new Thread() {
            @Override
            public void run() {
                listener.browseResult(NLoader.browse(genre, page));
            }
        }.start();
    }

    public void search(String query) {
        new Thread() {
            @Override
            public void run() {
                listener.searchResult(NLoader.search(query));
            }
        }.start();
    }

    public void novel(Novel novel) {
        new Thread() {
            @Override
            public void run() {
                listener.novelResult(NLoader.novel(novel));;
            }
        }.start();
    }

    public void page(NovelChapter chapter) {
        new Thread() {
            @Override
            public void run() {
                listener.pageResult(NLoader.page(chapter));;
            }
        }.start();
    }

    public Set<String> genres() {
        return NConstant.genres.keySet();
    }
}
