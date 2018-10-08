package cn.jbit.tax.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import cn.jbit.tax.dao.VehiclePurchaseTaxDao;
import cn.jbit.tax.entity.VehiclePurchaseTax;

public class VehiclePurchaseTaxDaoOracleImpl extends BaseDao implements VehiclePurchaseTaxDao {
	/*
	 * (non-Javadoc)
	 * @see cn.jbit.tax.dao.VehiclePurchaseTaxDao#save(cn.jbit.tax.entity.VehiclePurchaseTax)
	 */
	public void save(VehiclePurchaseTax item) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {			
			conn = this.getConnection();
			String sql = "insert into vehicle_purchase_tax values(?,sysdate,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, item.getIdCard());
			pstmt.setString(2, item.getIdentifier());
			pstmt.setDouble(3, item.getEmissions());
			pstmt.setDouble(4, item.getGuidePrice());
			pstmt.setDouble(5, item.getInvoicePrice());			
			pstmt.setDouble(6, item.getPurchaseTax());
			pstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {			
			this.closeAll(conn, pstmt, null);
		}		
	}

	
}
