package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_gameoverstate{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("gamedefeatedpanel").vw.setLeft((int)(0d));
views.get("gamedefeatedpanel").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("gamedefeatedpanel").vw.setTop((int)(0d));
views.get("gamedefeatedpanel").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("retry").vw.setLeft((int)((views.get("gamedefeatedpanel").vw.getWidth())/2d - (views.get("retry").vw.getWidth() / 2)));
views.get("retry").vw.setTop((int)((views.get("gamedefeatedpanel").vw.getHeight())/1.17d - (views.get("retry").vw.getHeight() / 2)));
views.get("buttontitle").vw.setLeft((int)((views.get("gamedefeatedpanel").vw.getWidth())/2d - (views.get("buttontitle").vw.getWidth() / 2)));
//BA.debugLineNum = 11;BA.debugLine="ButtonTitle.VerticalCenter = GameDefeatedPanel.Height/1.95"[GameOverState/General script]
views.get("buttontitle").vw.setTop((int)((views.get("gamedefeatedpanel").vw.getHeight())/1.95d - (views.get("buttontitle").vw.getHeight() / 2)));

}
}