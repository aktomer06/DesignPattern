package Prototype.Notebook;

public class Notebook {
    private PageType pageType;
    private RuleType ruleType;
    private Integer pageCount;
    private Frontpage frontPage;
    private BackPage backPage;

    public PageType getPageType() {
        return pageType;
    }

    public void setPageType(PageType pageType) {
        this.pageType = pageType;
    }

    public RuleType getRuleType() {
        return ruleType;
    }

    public void setRuleType(RuleType ruleType) {
        this.ruleType = ruleType;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Frontpage getFrontPage() {
        return frontPage;
    }

    public void setFrontPage(Frontpage frontPage) {
        this.frontPage = frontPage;
    }

    public BackPage getBackPage() {
        return backPage;
    }

    public void setBackPage(BackPage backPage) {
        this.backPage = backPage;
    }

    private Notebook() {

    }
    public Notebook(PageType pageType, RuleType ruleType, Integer pageCount) {
        this.pageType = pageType;
        this.ruleType = ruleType;
        this.pageCount = pageCount;
    }
    public Notebook clone(){
        Notebook notebook = new Notebook();
        notebook.pageType = this.pageType;
        notebook.ruleType = this.ruleType;
        notebook.pageCount = this.pageCount;
        return notebook;
    }
}
