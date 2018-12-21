import com.frank.simple.model.Country;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * .Description: Author: 金君良 Date: 2018/11/28 0028 下午 2:30
 */
public class CountryMapperTest {
  private static SqlSessionFactory sqlSessionFactory;

  @BeforeClass
  public static void init() {
    try {
      Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
      sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
      reader.close();
    }catch (IOException ignore) {
      ignore.printStackTrace();
    }
  }

  @Test
  public void testSelectAll() {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      List<Country> countrieList = sqlSession.selectList("selectAll");

    }finally {
      sqlSession.close();
    }
  }

  private void printCountryList(List<Country> countrieList) {
    countrieList.forEach(Country::printf);
  }
}
