/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ChavePrimaria;
import java.lang.reflect.Field;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FernandoFreitas
 */
public class controller {

    protected String geraSqlInsert(Object o) {
        String sql = null;
        sql = "INSERT INTO " + o.getClass().getSimpleName() + "(";
        int x = 0;
        for (Field atributo : o.getClass().getDeclaredFields()) {
            if ((atributo.getType().toString().equals("int")) || (atributo.getType().toString().equals("class java.lang.String"))) {


                if (x < o.getClass().getDeclaredFields().length - 1) {
                    sql += atributo.getName() + ",";
                } else {
                    sql += atributo.getName();

                }

            }
            x++;
        }
        sql += ") VALUES(";
        x = 0;
        for (Field atributo : o.getClass().getDeclaredFields()) {
            try {
                if ((atributo.getType().toString().equals("int")) || (atributo.getType().toString().equals("class java.lang.String"))) {
                    atributo.setAccessible(true);

                    if (x < o.getClass().getDeclaredFields().length - 1) {

                        sql += "'" + atributo.get(o).toString() + "',";

                    } else {
                        sql += "'" + atributo.get(o).toString() + "'";
                    }

                } else {
                    if (atributo.get(o).toString() != "-1") {
                        if (x < o.getClass().getDeclaredFields().length - 1) {

                            sql += "NULL" + ",";

                        } else {
                            sql += "NULL";
                        }
                    }
                }
            } catch (Exception ex) {
            }
            x++;
        }

        sql += ")";
        return sql;

    }

    protected String geraSqlAtualizar(Object o, List<ChavePrimaria> chaves) {
        /*
         String sql = null;
         PropertyInfo[] properties = o.GetType().GetProperties();
         sql = "UPDATE " + o.GetType().Name + " SET ";
         for (int x = 0; x < properties.Length; x++)
         {
         if (((properties[x].PropertyType.Name == "String") || (properties[x].PropertyType.Name == "Int32")))
         {

         if ((properties[x].GetValue(o, null).ToString() != "") && (properties[x].GetValue(o, null).ToString() != null) && (properties[x].GetValue(o, null).ToString() != "-1"))
         {

         if (x < properties.Length - 1)
         {

         sql += properties[x].Name + "='" + properties[x].GetValue(o, null).ToString() + "',";

         }
         else
         {
         sql += properties[x].Name + "='" + properties[x].GetValue(o, null).ToString() + "'";

         }
         }
         else
         {
         if (properties[x].GetValue(o, null).ToString() != "-1")
         {
         if (x < properties.Length - 1)
         {

         sql += properties[x].Name + "=" + "NULL" + ",";

         }
         else
         {
         sql += properties[x].Name + "=" + "NULL";

         }
         }

         }
         }
         }


         if (chaves.Count != 0)
         {
         if (chaves.Count == 1)
         {
         sql += " WHERE " + chaves[0].chave + "='" + chaves[0].valor + "'";
         }
         else
         {
         sql += " WHERE ";
         for (int x = 0; x < chaves.Count; x++)
         {
         if (x < chaves.Count - 1)
         {
         sql += chaves[x].chave + "='" + chaves[x].valor + "' AND ";
         }
         else
         {
         sql += chaves[x].chave + "='" + chaves[x].valor + "'";

         }
         }

         }



         }
         */
        return "";

    }

    protected String geraSqlExcluir(Object o, List<ChavePrimaria> chaves) {
        /*
         string sql = "DELETE FROM " + o.GetType().Name;

         if (chaves.Count != 0)
         {
         if (chaves.Count == 1)
         {
         sql += " WHERE " + chaves[0].chave + "='" + chaves[0].valor + "'";
         }
         else
         {
         sql += " WHERE ";
         for (int x = 0; x < chaves.Count; x++)
         {
         if (x < chaves.Count - 1)
         {
         sql += chaves[x].chave + "='" + chaves[x].valor + "' AND ";
         }
         else
         {
         sql += chaves[x].chave + "='" + chaves[x].valor + "'";

         }
         }

         }



         }
         */
        return "";

    }
}
