import React, { useEffect } from 'react'
import dashimg from "../../assets/images/Welcome_dashboard.png"
import { toast } from 'react-hot-toast'
import { useNavigate, NavLink } from 'react-router-dom'




const DashboardMain = () => {


  return (
    <section className='h-[80vh] bg-gray-600 border pt-[2rem]'>

      <h2 className='text-[1.5rem] text-[#f1f2f6] font-semibold text-center'>DashBoard</h2>
      <div className=' flex flex-row justify-around items-center'>

        <div className=' flex flex-col justify-center items-center gap-4'>
          <h3 className='text-[1.2rem] text-[#f1f2f6]'>Operations</h3>
          <NavLink to={"/admin/dashboard/admin"} ><button className='w-[10rem] p-2 bg-[#f1f2f6] font-semibold rounded '>Requests</button></NavLink>
          <NavLink to={"/admin/dashboard/accounts"} > <button className='w-[10rem] p-2 bg-[#f1f2f6] font-semibold rounded '>Accounts</button></NavLink>
          <NavLink to={"/admin/dashboard/transactions"} ><button className='w-[10rem] p-2 bg-[#f1f2f6] font-semibold rounded text-center'>Transactions</button></NavLink>

        </div>

        <div>
        this all about you
        </div>
      </div>
    </section>
  )
}


export default DashboardMain