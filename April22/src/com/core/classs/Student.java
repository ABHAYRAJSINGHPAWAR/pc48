package com.core.classs;

import com.core.enums.Subj;
public class Student {
	       private int id;
           private String name;
           private Subj Subject;
           private  double marks;
           
       //PARAM CTOR
		public Student(int id, String name, Subj subject, double marks) {
			super();
			this.id = id;
			this.name = name;
			Subject = subject;
			this.marks = marks;
		}
           
		
           
		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public Subj getSubject() {
			return Subject;
		}



		public void setSubject(Subj subject) {
			Subject = subject;
		}



		public double getMarks() {
			return marks;
		}



		public void setMarks(double marks) {
			this.marks = marks;
		}



		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", Subject=" + Subject + ", marks=" + marks + "]";
		}
}
