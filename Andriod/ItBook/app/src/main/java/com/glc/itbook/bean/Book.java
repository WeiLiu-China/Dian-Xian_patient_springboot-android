package com.glc.itbook.bean;

import java.util.List;

public class Book {

    /**
     * currentPage : 1
     * pageSize : 10
     * totalNum : 8516
     * isMore : 1
     * totalPage : 852
     * "book_download":"http://file.allitebooks.com/20200314/Essential ASP.NET Web Forms Development.pdf",
     "book_FileSize":" 18.9 MB"}]
     */

    private int currentPage;
    private int pageSize;
    private int totalNum;
    private int isMore;
    private int totalPage;
    private List<ItemsBean> items;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getIsMore() {
        return isMore;
    }

    public void setIsMore(int isMore) {
        this.isMore = isMore;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }


    public static class ItemsBean {
        /**
         * id : 1
         * book_name : PowerPoint 2019 For Dummies
         * book_img : http://www.allitebooks.org/wp-content/uploads/2020/03/PowerPoint-2019-For-Dummies.jpg
         * book_author : Doug Lowe
         * book_info : Get up and running fast with the PowerPoint 2019 PowerPoint continues to be the go-to tool for business presentations. The software helps anyone who needs to communicate clearly by creating powerful and effective slideshow presentations featuring data in the form of charts, clip art, sound, and video. You…
         * book_download : http://file.allitebooks.com/20200323/PowerPoint 2019 For Dummies.pdf
         * book_FileSize :  30.9 MB
         */

        private int id;
        private String book_name;
        private String book_img;
        private String book_author;
        private String book_info;
        private String book_download;
        private String book_FileSize;



        private String age;
        private String coordinate;
        private String time;
        private String bloodType;

        public int getId() {
            return this.id;
        }

        public void setId(final int id) {
            this.id = id;
        }

        public String getBook_name() {
            return this.book_name;
        }

        public void setBook_name(final String book_name) {
            this.book_name = book_name;
        }

        public String getBook_img() {
            return this.book_img;
        }

        public void setBook_img(final String book_img) {
            this.book_img = book_img;
        }

        public String getBook_author() {
            return this.book_author;
        }

        public void setBook_author(final String book_author) {
            this.book_author = book_author;
        }

        public String getBook_info() {
            return this.book_info;
        }

        public void setBook_info(final String book_info) {
            this.book_info = book_info;
        }

        public String getBook_download() {
            return this.book_download;
        }

        public void setBook_download(final String book_download) {
            this.book_download = book_download;
        }

        public String getBook_FileSize() {
            return this.book_FileSize;
        }

        public void setBook_FileSize(final String book_FileSize) {
            this.book_FileSize = book_FileSize;
        }

        public String getAge() {
            return this.age;
        }

        public void setAge(final String age) {
            this.age = age;
        }

        public String getCoordinate() {
            return this.coordinate;
        }

        public void setCoordinate(final String coordinate) {
            this.coordinate = coordinate;
        }

        public String getTime() {
            return this.time;
        }

        public void setTime(final String time) {
            this.time = time;
        }

        public String getBloodType() {
            return this.bloodType;
        }

        public void setBloodType(final String bloodType) {
            this.bloodType = bloodType;
        }


        /*public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getBook_name() {
            return book_name;
        }

        public void setBook_name(String book_name) {
            this.book_name = book_name;
        }

        public String getBook_img() {
            return book_img;
        }

        public void setBook_img(String book_img) {
            this.book_img = book_img;
        }

        public String getBook_author() {
            return book_author;
        }

        public void setBook_author(String book_author) {
            this.book_author = book_author;
        }

        public String getBook_info() {
            return book_info;
        }

        public void setBook_info(String book_info) {
            this.book_info = book_info;
        }

        public String getBook_download() {
            return book_download;
        }

        public void setBook_download(String book_download) {
            this.book_download = book_download;
        }

        public String getBook_FileSize() {
            return book_FileSize;
        }

        public void setBook_FileSize(String book_FileSize) {
            this.book_FileSize = book_FileSize;
        }*/
    }
}
