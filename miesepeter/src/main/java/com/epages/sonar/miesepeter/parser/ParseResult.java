package com.epages.sonar.miesepeter.parser;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.List;

public class ParseResult {
	private final List<IssueLine> lonelySet = new ArrayList<>();
	private final List<IssueLine> genericTle = new ArrayList<>();
	private final List<IssueLine> loopIssues = new ArrayList<>();
	private final List<IssueLine> javascript = new ArrayList<>();

	public List<IssueLine> getLonelySet() {
		return lonelySet;
	}

	public void setLonelySet(List<IssueLine> lonelySet) {
		this.lonelySet.clear();
		this.lonelySet.addAll(lonelySet);
	}

	public List<IssueLine> getGenericTle() {
		return genericTle;
	}

	public void setGenericTle(List<IssueLine> genericTle) {
		checkNotNull(genericTle);
		this.genericTle.clear();
		this.genericTle.addAll(genericTle);
	}

	public List<IssueLine> getLoopIssue() {
		return loopIssues;
	}

	public void setLoopIssues(List<IssueLine> loopIssue) {
		checkNotNull(loopIssue);
		this.loopIssues.clear();
		this.loopIssues.addAll(loopIssue);
	}

	public List<IssueLine> getJavascript() {
		return javascript;
	}

	public void setJavascript(List<IssueLine> javascript) {
		checkNotNull(javascript);
		this.javascript.clear();
		this.javascript.addAll(javascript);
	}
	
}
