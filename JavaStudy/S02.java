package JavaStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class S02 {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try{
            // db 연결 주소
            String url = "jdbc:mariadb://localhost:3307/hr";
            // db 연결
            connection = DriverManager.getConnection(url, "root", "1234");
            // 쿼리문 준비
            String sql = "select first_name from employees where employee_id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 100);
            // 쿼리문 실행
            resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                System.out.println(resultSet.getString("first_name"));
            }

        }catch(Exception e) {
            System.out.println(e.getMessage());
        }finally {
            // connection은 무조건 닫아줘야 하지만 null이 아닌 값으로..
            // 다른 것도 마찬가지
            if(connection != null) {
                connection.close();
            }
            if(preparedStatement != null){
                preparedStatement.close();
            }
            if(resultSet != null){
                resultSet.close();
            }
        }
    }
}