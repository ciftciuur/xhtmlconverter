import java.util.ArrayList;
import java.util.List;

public class RichToPrime {
	private String rihc, prime;
	static List<RichToPrime> list = new ArrayList<>();

	static {

		list.add(new RichToPrime("noSelectionLabel=\"SEÇİNİZ.\"", ""));

		list.add(new RichToPrime("onclick=\"Richfaces.showModalPanel('LoadingPanel')\"", ""));
		list.add(new RichToPrime("Richfaces.showModalPanel('LoadingPanel');", ""));
		list.add(new RichToPrime("Richfaces.hideModalPanel('LoadingPanel');", ""));

		list.add(new RichToPrime("</a4j:region>", ""));
		list.add(new RichToPrime("<a4j:region>", ""));
		list.add(new RichToPrime("h:selectOneMenu", "p:selectOneMenu"));
		list.add(new RichToPrime("<s:selectItems",
				"<f:selectItem itemLabel=\"Seciniz\" itemValue=\"\" /> <f:selectItems"));
		list.add(new RichToPrime("</s:selectItems>", ""));

		list.add(new RichToPrime("<s:convertEntity />", "itemLabel converter=\"MockBaseConverter\" "));
		list.add(new RichToPrime("<s:convertEnum />", "itemLabel"));

		list.add(new RichToPrime("oncomplete=\"applyMasks();\"", ""));

		list.add(new RichToPrime("label=\"#{", "itemLabel=\"#{"));

		list.add(new RichToPrime("styleClass=\"width100per input\"", ""));

		list.add(new RichToPrime("styleClass=\"width100per borderCollapsed\"", ""));

		list.add(new RichToPrime("alt=\"search_icon\"", "icon=\"ui-icon-search\""));

		// TODO: Silme ikonu eklen�cek fa-fa-eraser'di galiba
		// list.add(new RichToPrime("alt=\"clear_icon\"", "icon=\"ui-icon-search\""));
		// alt="select_icon"

		list.add(new RichToPrime("rowClasses=\"height40px evenRow,height40px oddRow\"", ""));

		list.add(new RichToPrime("noSelectionLabel=\"#{messages['selectOneMenu.NoSelection']}\"", ""));
		list.add(new RichToPrime("<a4j:support", "<p:ajax"));
		list.add(new RichToPrime("event=\"onchange\"", "event=\"change\" "));
		list.add(new RichToPrime("reRender", "update"));
		list.add(new RichToPrime("ajaxSingle=\"true\"", "process=\"@this\""));
		list.add(new RichToPrime("<h:outputLabel", "<p:outputLabel"));
		list.add(new RichToPrime("<h:inputText", "<p:inputText"));
		list.add(new RichToPrime("h:panelGrid", "p:panelGrid"));
		list.add(new RichToPrime("h:selectBooleanCheckbox", "p:selectBooleanCheckbox"));
		list.add(new RichToPrime("a4j:commandButton", "p:commandButton"));

		list.add(new RichToPrime("<h:inputNumberSpinner", "<p:spinner"));

		list.add(new RichToPrime("h:outputText", "p:outputLabel"));
		list.add(new RichToPrime("</h:inputText>", "</p:inputText>"));
		list.add(new RichToPrime("h:inputTextarea", "p:inputTextarea"));

		list.add(new RichToPrime("<rich:calendar", "<p:calendar pattern=\"dd.MM.yyyy\" mask=\"true\" locale=\"tr\""));
		list.add(new RichToPrime("popup=\"true\"", ""));

		list.add(new RichToPrime("<s:conversationId />", ""));
		list.add(new RichToPrime("<rich:extendedDataTable", "<p:dataTable emptyMessage=\"Kayıt Bulunamadı!\" "));
		// TODO: default olan k�s�mda buraya eklenicek
		list.add(new RichToPrime("componentControl", "oncomplete=\"PF('Wv').show()\""));
		list.add(new RichToPrime("<rich:modalPanel",
				"<p:dialog closeOnEscape=\"true\" header=\"\" style=\"width: auto !important;\" widgetVar=\"Wv\" modal=\"true\"> <ui:include src=\"/pages/\" /> </p:dialog> <rich:modalPanel"));

		list.add(new RichToPrime(".initHome}", ".create()}"));
		list.add(new RichToPrime(".initHome()}", ".create()}"));

		list.add(new RichToPrime("</a4j:support>", "</p:ajax>"));

		list.add(new RichToPrime(".initializeDataModel()", ".search()"));

		list.add(new RichToPrime("<ui:decorate template=\"/UC/common/PagingTemplate.xhtml\">",
				"<ui:decorate template=\"/pages/pagingtemplate.xhtml\">"));

		list.add(new RichToPrime("/UC/", "/pages/"));
		list.add(new RichToPrime("<h:inputNumberSpinner", "<p:spinner"));
		list.add(new RichToPrime("<s:convertDateTime pattern=\"dd.MM.yyyy\" />",
				"<f:convertDateTime pattern=\"dd.MM.yyyy\" timeZone=\"Turkey\" locale=\"tr_TR\" />"));
		list.add(new RichToPrime("Richfaces.hideModalPanel", "PF('Wv').hide()"));
		list.add(new RichToPrime("Richfaces.showModalPanel", "PF('Wv').show()"));
		list.add(new RichToPrime("enableManualInput=\"true\"", ""));
		list.add(new RichToPrime("event=\"onhide\"", "event=\"close\""));
		list.add(new RichToPrime("datePattern=\"dd.MM.yyyy\"", ""));
		list.add(new RichToPrime("title=\"DÜZENLE\"", "value=\"DÜZENLE\""));
		list.add(new RichToPrime("title=\"YENİ\"", "value=\"YENİ\""));
		list.add(new RichToPrime("title=\"SİL\"", "value=\"SİL\""));
		list.add(new RichToPrime("cellHeight=\"24\"", ""));
		list.add(new RichToPrime("cellWidth=\"24px\"", ""));
		list.add(new RichToPrime("cellHeight=\"22px\"", ""));
		list.add(new RichToPrime("inputSize=\"32\"", ""));

		list.add(new RichToPrime("noSelectionLabel=\"SEÇİNİZ\"", ""));

		list.add(new RichToPrime("styleClass=\"input inputlowered\"", "lcase=\"\""));

		list.add(new RichToPrime("alt=\"new_icon\"", "icon=\"ui-icon-add-circle-outline\""));
		list.add(new RichToPrime("alt=\"download_icon\"", "icon=\"ui-icon-cloud-download\""));

		list.add(new RichToPrime("<rich:simpleTogglePanel",
				"<p:accordionPanel> <p:tab></p:tab> </p:accordionPanel> <rich:simpleTogglePanel"));
		list.add(new RichToPrime("dateCalculateFunctions.dateToStr", "bWebDateFunctionsStatic.dateToStr"));
		list.add(new RichToPrime("alt=\"phoneArea\"", "mask=\"(999) 999 99 99\""));
		list.add(new RichToPrime("applyMasks();", ""));
		list.add(new RichToPrime("renderButtons();", ""));
		list.add(new RichToPrime("/rich:extendedDataTable", "/p:dataTable"));

		list.add(new RichToPrime("oncomplete=\"\"", ""));
		list.add(new RichToPrime("rich", "p"));
		list.add(new RichToPrime("onclick=\"\"", ""));
		list.add(new RichToPrime("#{beyazWebLicence", "#{bWebLicence"));
		list.add(new RichToPrime(
				"oncomplete=\"if(#{facesContext.maximumSeverity==null || facesContext.maximumSeverity.ordinal==0}) window.open('report.seam?cid=#{conversation.id}');\"",
				"oncomplete=\"defaultRequestHandler(xhr, status, args);\""));
		list.add(new RichToPrime("alt=\"new_icon\"", ""));
		list.add(new RichToPrime("value=\"YENİ\"", "value=\"Yeni\" icon=\"ui-icon-add-circle-outline\""));

	}

	public RichToPrime(String rihc, String prime) {
		super();
		this.rihc = rihc;
		this.prime = prime;
	}

	public static void add(RichToPrime richToPrime) {
		list.add(richToPrime);
	}

	public String getRihc() {
		return rihc;
	}

	public void setRihc(String rihc) {
		this.rihc = rihc;
	}

	public String getPrime() {
		return prime;
	}

	public void setPrime(String prime) {
		this.prime = prime;
	}
}
