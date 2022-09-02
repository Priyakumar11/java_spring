package com.DI;

public class TestEditor {
private SpellChecker sp;
	
	
	public TestEditor(){
	
	}
	public TestEditor(SpellChecker sp) {
		super();
		this.sp = sp;
	}
	public void spellCheck(){
		sp.checkSpelling();
	}
	public void setSp(SpellChecker sp) {
		this.sp = sp;
	}
	
}
