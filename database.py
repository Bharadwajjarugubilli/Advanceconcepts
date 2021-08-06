import mysql.connector
import csv


try:
    conn=mysql.connector.connect(user='root',password='3351@Klu',host='localhost',database='SAMPLE')
    print(conn)
    cursor=conn.cursor()
    with open("real2.csv","r") as fobj:
        for line in fobj:
           string1= line.split(",",2)
           street=string1[0]
           city=string1[1]
           print(street+" "+ city)
           query="insert into realestate2 value ('{}','{}')".format(street,city)
           cursor.execute(query)
           print("successfully inserteed ")
           conn.commit()
    conn.close()
    
    
   
           
            
    
    
    # if conn:
    #    mycursor=conn.cursor()
    #    print("ok")
    #    mycursor.execute("select * from realestate")
    #    count=mycursor.rowcount
    #    print("Helo")
       
    #    # with open("real2.csv","w") as fobj:
       #     writer=csv.writer(fobj)
       #     for record in mycursor.fetchall():
       #        print(str(record))
       #        writer.writerow(record)
       #        print("record written")
           
                
           
                   
                      
           
               
                                
                
                    

                 
                               
               
    # else :
    #   print("error by else ")

   

 
   
    
   

   
                                        
                            
       
             
                             
         
              
              
            
               
              
              
         
    
      # with open("realestate.csv","r") as fobj:
      #   reader=csv.reader(fobj)
      #   for record in reader:
      #       street=record[0]
      #       city=record[1]
      #       query="insert into realestate value ('{}','{}')".format(street,city)
      #       mycursor.execute(query)
      #       conn.commit()
  
   
 
       
  
 
     
  
   
   

except Exception as err:
    print(err)
    print("error by exceptyion")
    pass
