package net;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class ChatMgr3 {
	private DBConnectionMgr pool;
	
	public ChatMgr3() {
		pool = DBConnectionMgr.getInstance();
	}
	
	//로그인
	// select count(id) from tblRegister where id = ? and pwd = ? 
	//(db1)
	public boolean loginChk(String id, String pwd) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "select count(id) from tblRegister where id = ? and pwd = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			if(rs.next() && rs.getInt(1) == 1) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return flag;
	}
	//쪽지 insert
	//insert into tblMessage values (null, ?, ?, ?, now())
	//(db2)
	public void insertMsg(MessageBean3 bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			con = pool.getConnection();
			sql = "insert tblMessage values (null, ?, ?, ?, now())";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getFid());
			pstmt.setString(2, bean.getTid());
			pstmt.setString(3, bean.getMsg());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return;
	}
	
	//쪽지 List
	//select * from tblMessage where fid = ? or tid = ?
	//(db1)
	public Vector<MessageBean3> getMsgList(String id){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<MessageBean3> vlist = new Vector<MessageBean3>();
		try {
			con = pool.getConnection();
			sql = "select * from tblMessage where fid = ? or tid = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MessageBean3 bean = new MessageBean3();
				bean.setNo(rs.getInt("no"));
				bean.setFid(rs.getString("fid"));
				bean.setTid(rs.getString("tid"));
				bean.setMsg(rs.getString("msg"));
				bean.setMdate(rs.getString("mdate"));
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	//쪽지 Get
	//(db1) select * from tblMessage where fid = ? or tid = ?
	public MessageBean3 getMsg(int no) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		MessageBean3 bean = new MessageBean3();
		try {
			con = pool.getConnection();
			sql = "select *from tblMessage where no = ?";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				bean.setNo(rs.getInt("no"));
				bean.setFid(rs.getString("fid"));
				bean.setTid(rs.getString("tid"));
				bean.setMsg(rs.getString("msg"));
				bean.setMdate(rs.getString("mdate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return bean;
	}
}
