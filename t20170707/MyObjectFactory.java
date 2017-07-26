package t20170707;

import java.lang.reflect.Field;

public class MyObjectFactory {
	public <T> T getObject(String className) {
		try {

			Class<?> objectClass = Class.forName(className);
			Object object = objectClass.newInstance();
			Field[] fields = objectClass.getDeclaredFields();
			
			for (Field field : fields) {
				field.setAccessible(true);
				System.out.println(field.getType().getName());
				if (field.getType().getName().equals("java.lang.String")) {
					field.set(object, field.getName()+" initial value");
				}else{
					field.set(object,3);
				}
			}
			return (T) object;
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
