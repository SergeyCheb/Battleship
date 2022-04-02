class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public String getTitle() {
        return title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = new String[authors.length];
        for (int i = 0; i < authors.length; ++i) {
            String tmp = new String(authors[i]);
            this.authors[i] = tmp;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
}