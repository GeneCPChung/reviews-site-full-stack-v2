Non persistent database only requires the database to be created and operate while the server is running.
Ex: 
spring.jpa.show-sql=true

To create a persistent database, a trace file needs to be created to reference the data. 

Stop the server and add The below code
spring.jpa.show-sql=true
spring.datasource.url=jdbc:h2:file:../reviews-site-full-stack-v2/src/main/resources/static/comments;IFEXISTS=TRUE
spring.jpa.hibernate.ddl-auto=update

Note: "../reviews-site-full-stack-v2/src/main/resources/static/comments" (or wherever you want the trace file to be) must be added to the url field on the h2 console in order
for the trace file to be found. 

Once the data is added to the trace file (via the populator), stop the server, comment out (or remove) the code from the populator,
then restart the server. From that point on, any data placed into the database should be retained.
